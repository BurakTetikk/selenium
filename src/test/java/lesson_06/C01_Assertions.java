package lesson_06;

import org.junit.Assert;
import org.junit.Test;

public class C01_Assertions {


    int mehmetYas = 45;
    int burakYas = 67;
    int emeklilikYas = 65;

    @Test
    public void test01(){

        Assert.assertFalse(mehmetYas > emeklilikYas);

    }


    @Test
    public void test02(){

        Assert.assertTrue(burakYas > emeklilikYas);

    }

    @Test
    public void test03(){

        Assert.assertEquals(65, emeklilikYas);

    }



}
