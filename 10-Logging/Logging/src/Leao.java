import java.util.logging.Logger;

public class Leao {

    private int id;

    private static final Logger logger = Logger.getLogger(String.valueOf(Leao.class));
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int buscarId(){
        if(getId() % 2 == 0){
            logger.info("Número par");
        }
        else{
            logger.info("Número impar");
        }
        return getId();
    }
}
