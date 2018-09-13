class ConcretConn extends AbstConn {

    
    @Override
    public void initialize(final String ip, final int port){
        checkEnvironment();
        dbService = ip + ":" + port;
        dbSrc = "ConcretConn";
    }
}