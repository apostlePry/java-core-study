package com.desgin.study_05_factory_method.class01;

/**
 * @author test_jia
 * ClassName AddFactory
 * PackageName com.desgin.study_05_factory_method.class01
 * Description
 * <p>
 * Date: 2022/5/17
 * Time: 上午1:36
 */
public class AddFactory implements OperatorFactory {
    @Override
    public Operator createFactory() {
        return new AddOperator();
    }
}
