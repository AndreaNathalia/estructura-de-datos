from collections import defaultdict 

class Graph: 
    def __init__(self,vertices): 
        self.V = vertices
        self.graph = defaultdict(list) 
  
    def addEdge(self,u,v,w): 
        self.graph[u].append((v,w)) 
  
    def sort(self,v,seen,arr): 
        seen[v] = True
  
        if v in self.graph.keys(): 
            for node,weight in self.graph[v]: 
                if seen[node] == False: 
                    self.sort(node,seen,arr) 
  
        arr.append(v) 
  
    def shortestPath(self, x): 
        seen = [False]*self.V 
        arr =[] 

        for i in range(self.V): 
            if seen[i] == False: 
                self.sort(x,seen,arr) 

        distance = [float("Inf")] * (self.V) 
        distance[x] = 0
  
        while arr: 
            i = arr.pop() 

            for node,weight in self.graph[i]: 
                if distance[node] > distance[i] + weight: 
                    distance[node] = distance[i] + weight 
  
        # Print the calculated shortest distances 
        for i in range(self.V): 
            print ("%d" %distance[i]) if distance[i] != float("Inf") else  "Inf" , 
  
  
g = Graph(6) 
g.addEdge(0, 1, 5) 
g.addEdge(0, 2, 3) 
g.addEdge(1, 3, 6) 
g.addEdge(1, 2, 2) 
g.addEdge(2, 4, 4) 
g.addEdge(2, 5, 2) 
g.addEdge(2, 3, 7) 
g.addEdge(3, 4, -1) 
g.addEdge(4, 5, -2) 
  
# source = 1 
x = 2
  
print ("\nshortest distances from: %d " % x) 
g.shortestPath(x) 