package lanzallamas.users.categories;

import org.junit.Assert;
import org.junit.Test;

public class CategoryTest {
    @Test
    public void testConsumoMenorOIgual150EsR1(){
        Assert.assertEquals(Category.R1, Category.getInstance(0));
        Assert.assertEquals(Category.R1, Category.getInstance(100));
        Assert.assertEquals(Category.R1, Category.getInstance(149));
        Assert.assertEquals(Category.R1, Category.getInstance(150));
    }

    @Test
    public void testConsumoMayor150YMenorOIgual325EsR2(){
        Assert.assertEquals(Category.R2, Category.getInstance(151));
        Assert.assertEquals(Category.R2, Category.getInstance(250));
        Assert.assertEquals(Category.R2, Category.getInstance(324));
        Assert.assertEquals(Category.R2, Category.getInstance(325));
    }

    @Test
    public void testConsumoMayor325YMenorOIgual400EsR3(){
        Assert.assertEquals(Category.R3, Category.getInstance(326));
        Assert.assertEquals(Category.R3, Category.getInstance(370));
        Assert.assertEquals(Category.R3, Category.getInstance(399));
        Assert.assertEquals(Category.R3, Category.getInstance(400));
    }

    @Test
    public void testConsumoMayor400YMenorOIgual450EsR4(){
        Assert.assertEquals(Category.R4, Category.getInstance(401));
        Assert.assertEquals(Category.R4, Category.getInstance(425));
        Assert.assertEquals(Category.R4, Category.getInstance(449));
        Assert.assertEquals(Category.R4, Category.getInstance(450));
    }

    @Test
    public void testConsumoMayor450YMenorOIgual500EsR5(){
        Assert.assertEquals(Category.R5, Category.getInstance(451));
        Assert.assertEquals(Category.R5, Category.getInstance(470));
        Assert.assertEquals(Category.R5, Category.getInstance(499));
        Assert.assertEquals(Category.R5, Category.getInstance(500));
    }

    @Test
    public void testConsumoMayor500YMenorOIgual600EsR6(){
        Assert.assertEquals(Category.R6, Category.getInstance(501));
        Assert.assertEquals(Category.R6, Category.getInstance(550));
        Assert.assertEquals(Category.R6, Category.getInstance(599));
        Assert.assertEquals(Category.R6, Category.getInstance(600));
    }

    @Test
    public void testConsumoMayor600YMenorOIgual700EsR7(){
        Assert.assertEquals(Category.R7, Category.getInstance(601));
        Assert.assertEquals(Category.R7, Category.getInstance(650));
        Assert.assertEquals(Category.R7, Category.getInstance(699));
        Assert.assertEquals(Category.R7, Category.getInstance(700));
    }

    @Test
    public void testConsumoMayor700YMenorOIgual1400EsR8(){
        Assert.assertEquals(Category.R8, Category.getInstance(701));
        Assert.assertEquals(Category.R8, Category.getInstance(1250));
        Assert.assertEquals(Category.R8, Category.getInstance(1399));
        Assert.assertEquals(Category.R8, Category.getInstance(1400));
    }

    @Test
    public void testConsumoMayor1400EsR9(){
        Assert.assertEquals(Category.R9, Category.getInstance(1401));
        Assert.assertEquals(Category.R9, Category.getInstance(1450));
    }
}
