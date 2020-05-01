
/**
 * Constants.
 *
 * @author Shalin Shah
 * Email: shah.shalin@gmail.com
 */
public class Constants {

    public static int NUMBER_NODES; // populated by GraphReader.readGraph()

    /*
     * The file from which the graph has to be read.
     * The format is specified by the following URL:
     * http://www.nlsde.buaa.edu.cn/~kexu/benchmarks/graph-benchmarks.htm
     */
    public static String FILE = "data.CLQ";

    /* The number of iterations */
    public static int CLIQUE_ITERATIONS = 100000;

    /* Random Restart Parameters */
    public static final int TOLERANCE = 1000;

    /* Maximum iterations to spend on finding a unique random restart */
    public static int MAX_UNIQUE_ITERATIONS = 100;
}
