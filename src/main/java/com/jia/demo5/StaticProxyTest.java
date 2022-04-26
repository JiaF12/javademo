package com.jia.demo5;

/**
 * 静态代理
 */

interface ClothFactory {
    void prodeceCloth();
}

//代理类
class ProxyClothFactory implements ClothFactory {
    //用被代理类对象进行实例化
    private ClothFactory factory;

    public ProxyClothFactory() {
    }

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prodeceCloth() {
        System.out.println("代理工厂做一些准备工作");
        factory.prodeceCloth();
        System.out.println("代理工厂做一些收尾工作");
    }
}

//被代理类
class NikeClothFactory implements ClothFactory {
    @Override
    public void prodeceCloth() {
        System.out.println("耐克生成一批运动服");
    }
}

public class StaticProxyTest {
    public static void main(String[] args) {
        //创建被代理类对象
        NikeClothFactory nike = new NikeClothFactory();
        //创建代理类对象
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nike);

        proxyClothFactory.prodeceCloth();
    }
}
