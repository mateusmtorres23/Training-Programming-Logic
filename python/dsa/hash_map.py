from node_key import Node


class HashMap:
    def __init__(self, size=10):
        self.size = size
        self.buckets: list[Node | None] = [None] * size

    def hash_function(self, key):
        return sum(ord(c) for c in str(key)) % self.size

    def put(self, key, value):
        hash_value = self.hash_function(key)
        bucket_value: Node | None = self.buckets[hash_value]

        if not bucket_value:
            self.buckets[hash_value] = Node(key, value)
            return

        while bucket_value:
            if bucket_value.key == key:
                bucket_value.value = value
                return
            if not bucket_value.next:
                break
                
            bucket_value = bucket_value.next
        
        bucket_value.next = Node(key, value)

    def get(self, key):
        hash_value = self.hash_function(key)
        bucket_value: Node | None = self.buckets[hash_value]

        if not bucket_value:
            return None

        while bucket_value:
            
            if bucket_value.key == key:
                return bucket_value.value
                
            bucket_value = bucket_value.next
        
        return None
