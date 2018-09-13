abstract class AbstConn {

    protected String dbService;
    protected String dbSrc;

    abstract public void initialize(final String ip, final int port);
    
    protected void sendMessage(final String msg){
        // send obj to destination
        checkCredentials();
        System.out.println("Send Message: \n" + 
            "[FROM]:" + dbService + "\n" +
            "[TO]: " + dbSrc + "\n" +
            "[MSG]:" + msg);
    }
    
    protected void checkEnvironment(){
        // check user environment for pre-requisites
        System.out.println("Checking environment...");
    }

    protected void checkCredentials(){
        // check if authorized machine
        System.out.println("Checking credentials...");
    }


}