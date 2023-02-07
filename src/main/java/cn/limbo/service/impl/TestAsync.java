package cn.limbo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.AsyncResult;

import java.util.concurrent.Future;

@Slf4j
public class TestAsync {

    private void b() throws Exception{
        log.info("b方法开始执行");
        Thread.sleep(8000);
        log.info("b方法执行结束");
    }
    private Future<String> c() throws Exception{
        log.info("c方法开始执行");
        Thread.sleep(4000);
        log.info("c方法执行结束");
        return new AsyncResult<String>("C");
    }

    public static void main(String[] args) {
        TestAsync testAsync = new TestAsync();
        try {
            testAsync.b();
            Future future = testAsync.c();
            System.out.println(future.get());
            System.out.println(future.isDone());
        }catch (Exception e){
            e.getMessage();
        }
    }
}
