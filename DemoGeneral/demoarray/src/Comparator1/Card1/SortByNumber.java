import java.util.Comparator;

public class SortByNumber implements Comparator <Paper> {


  @Override
  public int compare(Paper o1, Paper o2) {
    return o2.size > o1.size ? 1 : -1;
  }
  //寫完以後任何class extends Paper就自動有左呢個compare



}
