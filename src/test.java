 class test extends Thread {
     public static void main(String[] args) {
         Thread a = Thread.currentThread();
         a.setName("Anjali");
         System.out.println(a.isAlive());
         System.out.println(a.getName());
         System.out.println(a.isDaemon());
         System.out.println(a.getPriority());
         a.setPriority(Thread.MAX_PRIORITY);
         System.out.println(a.getPriority());
         System.out.println(a.getId());
         System.out.println(a.getState());

     }

}
