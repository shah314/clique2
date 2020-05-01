<h2>Randomized Heuristic for the Maximum Clique Problem</h2>

<b>Author: Shalin Shah</b>

<a href="https://zenodo.org/badge/latestdoi/197826489"><img src="https://zenodo.org/badge/197826489.svg" alt="DOI"></a>

<div align="center"><img src="https://github.com/shah314/clique/raw/master/clique.jpg" align="center" border="0"></div><br>

A simple random search algorithm for the maximum clique problem in Java. A clique of a graph is a set of vertices in which each pair in the set have an edge between them i.e. it is a complete subgraph. A clique of maximum  size is called the maximum clique. Finding the maximum clique of a graph is an NP-hard problem, and it it not possible to approximate the problem within a constant factor of the optimum. The code uses an adjacency list format for the graph; so it does not require a lot of memory, and is quite fast for moderately large graphs. It finds reasonably good solutions for most graphs in the DIMACS benchmarks.

This algorithm performs the following steps:

	1) Create an initial clique using a greedy algorithm based on non-increasing degrees of the nodes
	and call it gBest
	2) Randomly remove two vertics from the clique created in step one.
	3) Add vertices to the incomplete clique returned by step two in order of non-increasing degrees.
	4) If the complete clique formed in step 3 is better than gBest, gBest = (3).
	5) Continue from step 2 till some termination criteria (Number of Iterations)

Instances are available <a href="http://www.nlsde.buaa.edu.cn/~kexu/benchmarks/graph-benchmarks.htm">here</a> and <a href="http://iridia.ulb.ac.be/~fmascia/maximum_clique/DIMACS-benchmark">here (DIMACS)</a>. Please remove all comments and other extraneous text from the graph text instance file.

<b>Cite this code</b><br>
<pre>
@misc{shah2016randomized,
  title={Randomized heuristic for the maximum clique problem},
  author={Shah, Shalin},
  year={2016}
}
</pre>
<br>
<b>Usage:</b>
<pre>
- Compile the code using any Java compiler (Tested using Java 8)
- Then run <b>java MaxClique <DIMACS File Name> <Number of Iterations></b>
- Typical number of iterations is 100000
- To use the code as an API, please see the main method in MaxClique.java
</pre>

<b>Results:</b><br>
Results on some randomly chosen DIMACS graphs. Please see <a href="http://iridia.ulb.ac.be/~fmascia/maximum_clique/DIMACS-benchmark">this page</a> for these and other maximum clique benchmarks (some with known optimum solutions). (You may have to run the algorithm a couple of times to get the best solution. It is quite fast and takes only a few seconds for 100,000 iterations).<br>
<table>
	<tr><td>Instance</td><td>Nodes (Vertices)</td><td>Edges</td><td>Best Known Clique</td><td>This Algorithm</td></tr>
	<tr><td>p_hat1500-3</td><td>1500</td><td>847244</td><td>94</td><td><b>93</b></td></tr>
	<tr><td>C2000.5</td><td>2000</td><td>999836</td><td>16</td><td><b>15</b></td></tr>
	<tr><td>p_hat700-1</td><td>700</td><td>60999</td><td>11</td><td>9</td></tr>
	<tr><td>C500.9</td><td>500</td><td>112332</td><td>57</td><td>53</td></tr>
	<tr><td>brock800_4</td><td>800</td><td>207643</td><td>26</td><td>19</td></tr>
	<tr><td>gen400_p0.9_75</td><td>400</td><td>71920</td><td>75</td><td>50</td></tr>
</table><br>
<b>Cited By:</b>
<ul>
<li>Choi, Jang-Ho, et al. "Distributed coordination of IoT-based services by using a graph coloring algorithm." Computer Software and Applications Conference (COMPSAC), 2013 IEEE 37th Annual. IEEE, 2013.</li>
<li>Muklason, Ahmad. "Hyper-heuristics and fairness in examination timetabling problems." Philosophy (2017)</li>
</ul>
