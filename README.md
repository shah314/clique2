<h2>Randomized Heuristic for the Maximum Clique Problem</h2>

Author: Shalin Shah

<a href="https://zenodo.org/badge/latestdoi/197826489"><img src="https://zenodo.org/badge/197826489.svg" alt="DOI"></a>

<div itemscope itemtype="https://schema.org/Person"><a itemprop="sameAs" content="https://orcid.org/0000-0002-3770-1391" href="https://orcid.org/0000-0002-3770-1391" target="orcid.widget" rel="noopener noreferrer" style="vertical-align:top;"><img src="https://orcid.org/sites/default/files/images/orcid_16x16.png" style="width:1em;margin-right:.5em;" alt="ORCID iD icon">https://orcid.org/0000-0002-3770-1391</a></div><br>

A simple random search algorithm for the maximum clique problem. A clique of a graph is a set of vertices in which each pair in the set have an edge between them i.e. it is a complete subgraph. A clique of maximum  size is called the maximum clique. Finding the maximum clique of a graph is an NP-complete problem, and it it not possible to approximate the problem within a constant factor of the optimal.

This algorithm performs the following steps:

	1) Create an initial clique using a greedy algorithm based on non-increasing degrees of the nodes
	and call it gBest
	2) Randomly remove two vertics from the clique created in step one.
	3) Add vertices to the incomplete clique returned by step two in order of non-increasing degrees.
	4) If the complete clique formed in step 3 is better than gBest, gBest = (3).
	5) Continue from step 2 till some termination criteria (Number of Iterations)

Instances are available <a href="http://www.nlsde.buaa.edu.cn/~kexu/benchmarks/graph-benchmarks.htm">here</a> and <a href="http://iridia.ulb.ac.be/~fmascia/maximum_clique/DIMACS-benchmark">here (DIMACS)</a>. Please remove all comments and other extraneous text from the graph text instance file.

<b>Cited By:</b><ul><li>Choi, Jang-Ho, et al. "Distributed coordination of IoT-based services by using a graph coloring algorithm." Computer Software and Applications Conference (COMPSAC), 2013 IEEE 37th Annual. IEEE, 2013.</li><li>Muklason, Ahmad. "Hyper-heuristics and fairness in examination timetabling problems." Philosophy (2017)</li>
</ul>

Usage:
	- Change Constants.FILE to the file on your disk that represents the graph
	- Change Constants.ANNEALING_ITERATIONS to the number of iterations the algorithm should run for
