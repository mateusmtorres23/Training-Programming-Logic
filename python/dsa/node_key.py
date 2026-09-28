class Node:
    def __init__(self, key, value):
        self.key = key
        self.value = value
        self.next: Node | None = None