package emily.offer._2_singleton;

public class SingletonLazy {
    private static SingletonLazy s=null;
    private SingletonLazy() {}
    public SingletonLazy getInstance() {
       if(null == s){ // when s为null的时候，加锁
          synchronized (SingletonLazy.class) { //锁住，不允许其他线程操作s
              if（s == null) s=new SingletonLazy();
              }
          }
        return s;
      }
}
