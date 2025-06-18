class Logger{
    private static volatile Logger instance;
    private Logger(){
        System.out.println("Logger Constructor");
    }

    public static Logger getInstance(){
        if(instance==null){
            synchronized(Logger.class){
                if(instance==null){
                    instance=new Logger();
                }

            }
        }
        return instance;
    }
         public void log(String message) {
              System.out.println("Log: " + message);
    }

}