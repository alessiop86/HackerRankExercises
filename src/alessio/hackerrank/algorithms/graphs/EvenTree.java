package alessio.hackerrank.algorithms.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/even-tree
 */



public class EvenTree {

    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
        List<Edge> edges = new ArrayList<Edge>();
		for (int i = 0;i<M;i++) {
			int from = sc.nextInt();
            int to = sc.nextInt();
            int min = Math.min(from,to);
            int max = Math.max(from,to);
            edges.add(new Edge(min,max));
		}        
		sc.close();
		
		//NODI [DA 0 A 9]
		List<Node> nodes = new ArrayList<Node>();
		for (int i =0;i<N;i++) {
			nodes.add(new Node(i+1));
		}

		
		Node n = buildTree(edges,nodes);
		
		findMaxNumberOfCuttableEdges(nodes);
		
		
	
	}
	
	private static void findMaxNumberOfCuttableEdges( List<Node> nodes) {
		int cuttables = 0;
		for (Node node : nodes)
        {
			if (node.elementsOfSubtreesBelowThisNode % 2 == 0) {
                cuttables++;
                System.err.println(node.label + " is cuttable");
            }
				
        }
		System.out.println(cuttables -1);
	}

	private static Node buildTree(List<Edge> edges,List<Node> nodes) {
		
		for (Edge edge : edges) {					
			nodes.get(edge.from-1).addChild(nodes.get(edge.to-1 ));
			nodes.get(edge.to-1).father = nodes.get(edge.from-1 );
			nodes.get(edge.from-1).leaf = false;
		}
		
		for  (int i=0;i<nodes.size();i++) {
			if (nodes.get(i).leaf) {
				nodes.get(i).startUpdateFromLeaf();
			}
		}
		
		//return the root
		return nodes.get(0);
		
		
	}
	
	static class Edge {
		Integer from;
		Integer to;
		public Edge(Integer from,Integer to) {
			this.from 	 = from;
			this.to		 = to;
		}
	}
	
	/* Nodes */
	static class Node {
		
		boolean leaf = true;
		int label;
		int elementsOfSubtreesBelowThisNode = 1;
		
		public Node(int label) {
			this.label = label;
		}
		
		
		List<Node> childs = new ArrayList<Node>();
		Node father;
		
		@Override
		public String toString() {
			String str = label + "(" + elementsOfSubtreesBelowThisNode;  
			if (alreadyUpdatedToFather)
				str +="-S)";
			else
				str +="-N)";
			return str;
		}
		
		public void addChild(Node n) {
			childs.add(n);
		}

		boolean alreadyUpdatedToFather = false;
		
		void startUpdateFromLeaf() {
			//System.out.println("LABEL " + label + " LEAF NODE, INIZIO AD AGGIORNARE I GENITORI");
			updateParents(1);
		}
		
		/**
		 * updateChain dice di quanto incrementare i genitori.
		 * Questo numero deve essere paari al numero dei nuov
		 * 
		 * @param updateChain
		 */
		void updateParents(int updateChain) {
			
			if (father != null) {				
				father.elementsOfSubtreesBelowThisNode+= updateChain;
				
				//update father of my father??
				if (!father.alreadyUpdatedToFather) {				
					father.alreadyUpdatedToFather = true;
					++updateChain;
				}

				father.updateParents(updateChain);
			}
		}

	}
}
