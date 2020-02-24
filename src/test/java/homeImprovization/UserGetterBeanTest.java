package homeImprovization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

class UserGetterBeanTest {

    @BeforeEach
    public void setUp() {
        UserGetterBean userGetterBean;
    }

    @Test
    public void testUserGetterBean() {
        UserGetterBean userGetterBean = new UserGetterBean(1, "Michael");

        try {
            String jsonResult = new ObjectMapper().writeValueAsString(userGetterBean);
            System.out.println(jsonResult);
            assertThat(jsonResult, containsString("id"));
            assertThat(jsonResult, containsString("firstName"));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }



}