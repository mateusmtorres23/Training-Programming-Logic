from node import Node


def get_min_value(node):
    curr = node
    while curr.left:
        curr = curr.left
    return curr


def remove_bst(root: Node, value):
    if root is None:
        return root
    
    if root.left and value < root.value:
        root.left = remove_bst(root.left, value)
    
    elif root.right and value < root.value:
        root.right = remove_bst(root.right, value)
    
    else:
        if root.left is None:
            return root.right
        elif root.right is None:
            return root.left
        
        successor = get_min_value(root.right)

        root.value = successor.value

        root.right = remove_bst(root.right, successor.value)

    return root