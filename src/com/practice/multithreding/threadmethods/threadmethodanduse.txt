1. start() : Jab bhi hum Thread object create karta hai : Thread t1 = new Thread();
              Jab hum [ t1.start() ]karta hai to ya thread ka run() call karta hai
              aur hamari thread running state main aa jati hai.

2. run() :  yaha method start() method call karna ka bad chalta hai
            is method main hamara logic implement hota hai aur isma hama run()
            @Override karna padta hai jisma hum apna logic likhta hai.

3. sleep() : Is method main hum kuch current thread ko kuch time ka liya
                wait/suspend kar deta hai

4, join() : Suppose mera pass 2 thread hai t1 and t2.
            ab hum t1.join() karaga aur join ka kaam hai ki
            jab tak t1 apna kaam complete/Done nahi kar leta tab tak t2 thread wait karaga.

5. setPriority() : Isma hum Thread ki Priority set karta hai.
                   3 Type ki Priority Hoti hai MIN_PRIORITY =1 ,MAX_PRIORITY=10 ,NORM_PRIORITY=5
                   Set kaisa karata hai : Thread t1 = new Thread();
                   t1.setPriority(Thread.MAX_PRIORITY);

6. interrupt() : Jab bhi hum interrupt() method kisi bhi thread main perform karaga
                 t1.interrupt() to turant hi t1 thread sabhi kaam band kar degi jaisa sleep() wait()
                 and [java.lang.InterruptedException: sleep interrupted] exception ayagi jab t1.interrupt()
                 method call karaga.

7. yield() : Agar mera pass 2 Thread hai t1 and t2 aur hum data print kar raha hai
             Agar bin Yield ka hum Data print karaga ya to t1 start main
             multiple time data print karaga ya phir t2. Par yaha koi surety nhi hai kon pehla karaga.
           - Agar hum Data print/process ka bad Thread.yield() call karata hai jo hum
             cahata hai ki data random and continues print ho t1,t2,t1,t2,t1,t2... ulta bhi ho sakata hai
             but ya sure nahi hai hum buss hint deta hai ab thread kaisa chala ya pata nahi

8. SetDaemon() : Normal Thread -->> When you create MyThread t1 = new MyThread(); this is called a User Thread.
                 Jis thread ka hum operation perform karata ha wahi User Thread hota hai.
                 User Thread ka matlab jo Kaam Kar raha hai
                Daemon Thread -->> Jo Background main Chal Raha hai
                JVM ka bina bhi ruk jata hai agar sabhi thread complete ho gaya hai to
                Daemon Thread bhi stop ho jayaga.