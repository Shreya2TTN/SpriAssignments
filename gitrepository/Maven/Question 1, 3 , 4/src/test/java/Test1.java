import com.MavenEx.Addiing;
import org.junit.Assert;
import org.junit.Test;
public class Test1 {
    @Test
    public void testAdding(){
        Addiing a=new Addiing();
        Assert.assertEquals(4,a.adding(2,2));
    }

}
