package behavior.template;

/**
 * 花生豆浆
 */
public class PeanutSoyaMilk extends  SoyaMilk{

    @Override
    void addCondiments() {
        System.out.println("加入上好的花生");
    }

    @Override
    boolean isAddCondiments() {
        return true;
    }

}
