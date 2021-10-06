package com.testng;

import com.ProviderApplication;
import com.zookeeper.UserSampleServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertNotNull;

/**
 * Administrator
 * 2021/9/9 0009
 */
@SpringBootTest(classes = {ProviderApplication.class}, properties = {"classpath:*.yml", "classpath:*.xml"}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestNGLoader {
    private UserSampleServiceImpl userSampleService = new UserSampleServiceImpl();

    @Test
    @After
    public  void classAfter(){
        System.out.println("after");
    }

    @Test
    @After
    public  void classAfterTwo(){
        System.out.println("after two");
    }

    @AfterClass
    public  void classAfterEnd(){
        System.out.println("end after");
    }

    @BeforeClass
    public void classBeforeFirst(){
        System.out.println("first before");
    }

    @Before
    public void classBefore(){
        System.out.println("before test");
    }

    @Test
    public void testCreate() {
        userSampleService.hello("message");
        assertNotNull(userSampleService);
    }

    @Test
    @Ignore
    public void testCreateIgnore() {
        System.out.println("before test ignore");
        userSampleService.hello("message");
        assertNotNull(userSampleService);
    }
}
