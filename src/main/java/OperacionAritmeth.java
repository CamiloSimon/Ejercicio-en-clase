/**
 * Created by Camilo on 05/06/2018.
 */
public class OperacionAritmeth {
}

public int multiplicacion(int a, int b){
    return a*b;
}

@Test
public void testMultiplicacion(){
    Assert.IsEqual(multiplicacion(5, 3), 15);
}
