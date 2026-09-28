def dijkstra(
        graph: dict[str, list[tuple[str, int]]], 
        start: str, 
        goal: str
        ) -> tuple[int, list[str]]:
    # Dicionarios para construir o menor caminho e manter o rastreio do menor peso
    came_from = {}
    costs = {start: 0}

    # Fila para armazenar os nós que estão sendo processados, se a fila acabou os nós acabaram
    queue = [(start, 0)]
    while queue:
        # Variáveis que armazenam o nó, o peso do start até ele e os vizinhos dele
        node, cur_dist = min(queue, key=lambda x: x[1])
        queue.remove((node, cur_dist))

        neighbors = graph.get(node, [])

        # Condição de parada
        if node == goal:
            path = []
            while node in came_from:
                path.append(node)
                node = came_from[node]
            path.append(start)
            path.reverse()
            return (cur_dist, path)
            
        # Loop para calcular as distâncias dos vizinhos e adiciona-los na fila
        for n in neighbors:
            n_node = n[0]
            n_weight = n[1]
            new_distance = cur_dist + n_weight

            if new_distance < costs.get(n_node, float('inf')):
                costs[n_node] = new_distance
                came_from[n_node] = node 
                queue.append((n_node, new_distance))
    
    return (0, [])
