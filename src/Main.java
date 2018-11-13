import java.io.InputStreamReader;

import controller.StockControllerImpl;
import model.StockModelImpl;

public class Main {

  public static void main(String[] args) {
    new StockControllerImpl(new InputStreamReader(System.in), System.out)
            .start(StockModelImpl.getBuilder().build());
  }
}
