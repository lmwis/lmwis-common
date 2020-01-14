package com.fehead.lang;

import com.fehead.lang.componment.StringIdGenerator;
import lombok.RequiredArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.UUID;

/**
 * @Description:
 * @Author lmwis
 * @Date 2019-11-14 21:51
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = IdGeneratorTest.class)
@RequiredArgsConstructor
public class IdGeneratorTest {


    StringIdGenerator stringIdGenerator = new StringIdGenerator();

    @Test
    public void whenGeneratorId(){
        String s = stringIdGenerator.generatorId();
        System.out.println(s);
    }
}
