package structure.facade;

/**
 * @description: 模式A
 * @author: dingwei17@jd.com
 * @date : 2023/8/8 16:13
 */
public class ModuleA {

    /**
     * 提供给子系统外部使用的方法
     */
    public void a1(){};

    /**
     * 子系统内部模块之间相互调用时使用的方法
     */
    private void a2(){};
    private void a3(){};

}
