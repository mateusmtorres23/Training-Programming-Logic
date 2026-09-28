from collections import deque


def bfs_shortest_path(graph, start: str, goal: str):
    if start == goal:
        return [start]

    visited = set([start])
    came_from = {}

    queue = deque([start])
    while queue:
        node = queue.popleft()
        neighbors = graph.get(node, [])

        for n in neighbors:
            if n not in visited:
                came_from[n] = node
                queue.append(n)
                visited.add(n)

                if n == goal:
                    path = []

                    while n in came_from:
                        path.append(n)
                        n = came_from[n]

                    path.append(start)
                    path.reverse()
                    return path
    
    return None
