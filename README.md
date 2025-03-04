## Limited Resource Problem

### Overview

-   In this project, you are tasked with developing a system that efficiently manages a resource with limited processing capabilities under high load. The resource can handle a maximum of 10 requests per second (RPS) and can be replicated up to n times, giving a total capacity of 10n RPS. However, the service receives around 50(10\*n) RPS, far exceeding the available capacity.

-   This project aims to create a load-balancing solution that can distribute the incoming traffic efficiently while ensuring the system remains responsive and stable. This requires careful management of the requests and implementing strategies to mitigate overload and prevent resource exhaustion.

### unctional Requirements

-   Handle 50*(10*n) RPS while ensuring at most 10\*n RPS reaches the resources at any time
-   Distribute requests evenly across the replicated instances of the resource.
-   Handle failures gracefully (e.g., if one instance becomes unavailable, shift the load to some other cases).

### Non-functional Requirements

-   The system should maintain low latency for request processing.
-   Ensure the system remains stable under load and can handle sudden traffic spikes.
-   The design should allow for future scaling options if more resource instances become available.

### Evaluation Criteria

-   The system must not allow more than 10\*n RPS to hit the resources.
-   The system should process requests quickly and adapt to varying load conditions.
-   The solution should be easily extendable to support additional instances of the resource.
-   The system should recover gracefully from failures and adapt to traffic surges.

### Deliverables

-   A fully implemented solution.
-   Documentation of the design decisions, algorithms used, and any trade-offs made.
-   Test cases demonstrating the system's performance under different load scenarios.
