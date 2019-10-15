package club.lylgjiang.singleton.exercises1;

/**
 * @Classname Triple
 * @Description 实现最多生成三个实例
 * @Date 2019/10/15 22:44
 * @Created by Jiavg
 */
public class Triple {
    
    private static Triple[] triples = new Triple[3];
    
    static {
        for (int i = 0; i < 3; i++) {
            triples[i] = new Triple();
        }
    }

    public Triple() {
    }
    
    public static Triple getInstance(int i) {
        
        if (i < 0 || i > 2) {
            throw new RuntimeException("实例下标越界.");
        }
        
        return triples[i];
    }
    
}
