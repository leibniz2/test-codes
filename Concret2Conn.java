import java.util.Objects;

class Concret2Conn extends AbstConn {

    
    @Override
    public void initialize(final String ip, final int port){
        checkEnvironment();
        dbService = ip + ":" + (port + generateHash());
        dbSrc = "ConcretConn2";
    }

    private int generateHash(){
        return Objects.hash("top-secret-code");
    }
}