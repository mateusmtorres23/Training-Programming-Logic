def has_cycle(graph: dict[str, list[str]]) -> bool:
    visiting = set()
    visited = set()

    def dfs(graph, current_node, visited: set, visiting: set):
        if current_node in visiting:
            return True
        
        visiting.add(current_node)

        for n in graph[current_node]:
            if n not in visited:
                rv = dfs(graph, n, visited, visiting)
                if rv:
                    return True

        visiting.remove(current_node)
        visited.add(current_node)
        return False

    for node in graph:
        if node not in visited:
            rv = dfs(graph, node, visited, visiting)
            if rv:
                return True

    return False
