package com.simscale.apitests;

import static com.simscale.rules.tags.RunTagValue.REGRESSION;
import static org.junit.Assert.assertEquals;

import com.simscale.domain.project.PublicPermission;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;

import com.simscale.domain.project.Project;
import com.simscale.domain.projectv2.ProjectDTOV2;
import com.simscale.domain.user.User;
import com.simscale.http.HttpResponseEntity;
import com.simscale.rest.ProjectApiClient;
import com.simscale.rest.ProjectApiV2Client;
import com.simscale.rules.tags.RunTagsClassRule;
import com.simscale.rules.tags.SuiteTagsRule;
import com.simscale.rules.tags.TestSuiteRunTag;
import com.simscale.steps.RegistrationSteps;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

@Title("Project API V2 Tests")
@Description("Tests against new project's api v2 endpoints")
@TestSuiteRunTag(tags = {REGRESSION})
public class ProjectApiV2Test {

    @ClassRule
    public static RunTagsClassRule runTagsClassRule = new RunTagsClassRule();

    @Rule
    public RuleChain ruleChain = RuleChain.outerRule(new SuiteTagsRule());

    private static ProjectApiClient projectAPIClient;
    private static ProjectApiV2Client projectAPIV2Client;
    private static Project project;

    @BeforeClass
    public static void setUpTests() {
        User user = RegistrationSteps.registerNewUser();
        projectAPIClient = new ProjectApiClient(user);
        projectAPIV2Client = new ProjectApiV2Client(user);
    }

    @Before
    public void setup() {
        project = projectAPIClient.createProjectAndOpen();
    }

    @Test
    @Title("Get Project")
    @Description("Should get project information")
    public void getProjectInformation() {
    	// given created project

        // when
        ProjectDTOV2 returnedProject = projectAPIV2Client.getProject(project.getId());

        // then
        assertEquals(project.getId(), returnedProject.getProjectIdExt());
        assertEquals(project.getProjectNamePublic(), returnedProject.getPublicProjectName());
        assertEquals(project.getOwnerName(), returnedProject.getOwnerUsername());
        assertEquals(project.getProjectName(), returnedProject.getName());
        assertEquals(project.getDescription(), returnedProject.getDescription());
        assertEquals(project.getCategories(), returnedProject.getCategories());
    }

    @Test
    @Title("Get private project without permission")
    @Description("Should return 404 when trying to get private project without permission")
    public void getPrivateProjectInformation() {
    	// given
        User anotherUser = RegistrationSteps.registerNewUser();
    	Project privateProject = new ProjectApiClient(anotherUser).createPrivateProject();

    	// when
    	HttpResponseEntity responseEntity = projectAPIV2Client.getProjectBase(privateProject.getId());
    	assertEquals(HttpStatus.SC_NOT_FOUND, responseEntity.getCode());
    }

    //Added by Yevgen

    @Test
    @Title("Get private project without permission")
    @Description("Should return 404 when trying to get private project without permission")
    public void getPrivateProjectInformation() {
        // given
        User anotherUser = RegistrationSteps.registerNewUser();
        Project privateProject = new ProjectApiClient(anotherUser).createPrivateProject();
        privateProject.set
        // when
        HttpResponseEntity responseEntity = projectAPIV2Client.getProjectBase(privateProject.getId());
        assertEquals(HttpStatus.SC_NOT_FOUND, responseEntity.getCode());


    @Test
    @Title ("Get project without ID")
    @Description("Should return 404 when trying to get  project without Id")
    public void getProjectWithoutId(){

        HttpResponseEntity responseEntity = projectAPIV2Client.getProjectBase("");
        assertEquals(HttpStatus.SC_NOT_FOUND, responseEntity.getCode());
    }

    @Test
    @Title ("Get project without ID and with request parameters")
    @Description("Should return 404 when trying to get project without ID and with wring request parameters")
    public void getProjectWithoutIdWithParameters(){

        String wrongIdWithParameters = "?id=" + project.getId();
        HttpResponseEntity responseEntity = projectAPIV2Client.getProjectBase(wrongIdWithParameters);
        assertEquals(HttpStatus.SC_NOT_FOUND, responseEntity.getCode());
    }

    @Test
    @Title ("Get project without ID and with wrong format of request parameters")
    @Description("Should return 404 when trying to get project without ID with wrong format of request parameters")
    public void getProjectWithoutIdWithWrongParameters(){

        String wrongIdWithWrongParameters = "?" + project.getId();
        HttpResponseEntity responseEntity = projectAPIV2Client.getProjectBase(wrongIdWithWrongParameters);
        assertEquals(HttpStatus.SC_NOT_FOUND, responseEntity.getCode());
    }

    @Test
    @Title ("Get project with wrong random ID")
    @Description("Should return 404 when trying to get project with wrong random ID")
    public void getProjectWithWrongRandomId(){

        String wrongRandomId = "384395345dsfdfgd75679584dhfgkjdhfgdhkghfgkdjfgada676asd7a6d7a";
        HttpResponseEntity responseEntity = projectAPIV2Client.getProjectBase(wrongRandomId);
        assertEquals(HttpStatus.SC_NOT_FOUND, responseEntity.getCode());
    }

    @Test
    @Title ("Get project with not exeisted ID")
    @Description("Should return 404 when trying to get project with not existed Id")
    public void getProjectWithNotExistedId(){

        HttpResponseEntity responseEntity = projectAPIV2Client.getProjectBase("00000007777777");
        assertEquals(HttpStatus.SC_NOT_FOUND, responseEntity.getCode());
    }

    @Test
    @Title ("Get project with duplicated ID")
    @Description("Should return 404 when trying to get project with duplicated Id")
    public void getProjectWithDuplId(){

        String duplicatedId = projectAPIV2Client.getProjectBase(project.getId()) + "&" + projectAPIV2Client.getProjectBase(project.getId());
        HttpResponseEntity responseEntity = projectAPIV2Client.getProjectBase(duplicatedId);
        assertEquals(HttpStatus.SC_NOT_FOUND, responseEntity.getCode());
    }

    @Test
    @Title ("Get project with duplicating ID in parameters")
    @Description("Should return 404 when trying to get project with duplicating ID in parameters")
    public void getProjectWithDuplIdInPar(){

        String duplicatingId = projectAPIV2Client.getProjectBase(project.getId()) + "?id=" + projectAPIV2Client.getProjectBase(project.getId());
        HttpResponseEntity responseEntity = projectAPIV2Client.getProjectBase(duplicatingId);
        assertEquals(HttpStatus.SC_NOT_FOUND, responseEntity.getCode());
    }

    @Test
    @Title ("Get project without Authentification header")
    @Description("Should return 404 when trying to get project without Authentification header")
    public void getProjectWithoutAuthHeader(){
        //User unAuthUser = new User();
        user
        projectAPIV2Client1 = projectAPIV2Client

        HttpResponseEntity responseEntity = projectAPIV2Client.getProjectBase(project.getId());
        assertEquals(HttpStatus.SC_UNAUTHORIZED, responseEntity.getCode());
    }


}



