import gc


class Node:
    def __init__(self, val):
        self.value = val
        self.left_child = None
        self.right_child = None

    def insert(self, data):
        if self.value == data:
            return False
        elif self.value > data:
            if self.left_child:
                return self.left_child.insert(data)
            else:
                self.left_child = Node(data)
                return True
        else:
            if self.right_child:
                return self.right_child.insert(data)
            else:
                self.right_child = Node(data)
                return True

    def find(self, key):
        if self.value == key:
            return True
        elif self.value > key:
            if self.left_child:
                return self.left_child.find(key)
            else:
                return False
        else:
            if self.right_child:
                return self.right_child.find(key)
            else:
                return False

    def traverse(self):
        print(self.value)
        if self.left_child:
            self.left_child.traverse()
        if self.right_child:
            self.right_child.traverse()

    def find_min(self):
        if self.left_child:
            return self.left_child.find_min()
        else:
            return self.value

    def find_max(self):
        if self.right_child:
            return self.right_child.find_max()
        else:
            return self.value



class Tree:
    def __init__(self):
        self.root = None

    def insert(self, data):
        if self.root:
            return self.root.insert(data)
        else:
            self.root = Node(data)
            return True

    def find(self, key):
        if self.root:
            return self.root.find(key)
        else:
            return False

    def traverse(self):
        if self.root:
            self.root.traverse()
        else:
            return False

    def find_min(self):
        if self.root:
            return self.root.find_min()
        else:
            return False

    def find_max(self):
        if self.root:
            return self.root.find_max()
        else:
            return False

      ## -- TAREA --
    def delete(self, d):
    
        if self.root == None:
            return False
	
        # Buscar
        parent = None
        node = self.root
        while node and node.value != d:
            parent = node
            if d < node.value:
                node = node.left_child
            elif d > node.value:
                node = node.right_child
        
        # 
        if node.left_child == None and node.right_child == None:
            if d < parent.value:
                parent.left_child = None
            else:
                parent.right_child = None
            return True

        # 
        elif node.left_child and node.right_child == None:
            if d < parent.value:
                parent.left_child = node.left_child
            else:
                parent.right_child = node.left_child
            return True

        # 
        elif node.left_child == None and node.right_child:
            if d < parent.value:
                parent.left_child = node.right_child
            else:
                parent.right_child = node.right_child
            return True

        # 
        else:
            temp = node
            move = node.right_child
            while move.left_child:
                temp = move
                move = move.left_child
            node.value = move.value
            if move.right_child:
                if move.value < temp.value:
                    temp.left_child = move.right_child
                else:
                    temp.right_child = move.right_child
            else:
                if move.value < temp.value:
                    temp.left_child = None
                else:
                    temp.right_child = None
            return True


def main():
    bst = Tree()
    bst.insert(5)
    bst.insert(15)
    bst.insert(20)
    bst.insert(21)
    bst.insert(18)
    bst.insert(30)
    bst.insert(120)
    bst.insert(-15)
    bst.insert(-100)

    print("----- First Tree: -----\n")
    for obj in gc.get_objects():
        if isinstance(obj, Tree):
            print("Tree:      ", obj)
            print("")

    for obj in gc.get_objects():
        if isinstance(obj, Node):
            print("Node: ", obj.value, "     ", obj)
            print("Right Child: ", obj.right_child)
            print("")
    
    bst.delete(18)


    print("\n\n ----- New tree: -----\n")
    for obj in gc.get_objects():
        if isinstance(obj, Tree):
            print("Tree: ", obj)
            print("")

    for obj in gc.get_objects():
        if isinstance(obj, Node):
            print("Node: ", obj.value, "     ", obj)
            print("Right Child: ", obj.right_child)
            print("")



if __name__ == "__main__":
    main()