import matplotlib.pyplot as plt

# Data
sizes = [1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576]
mm_quick_sort_times = [150362, 115862, 144087, 276200, 505487, 721437, 1386962, 2794125, 5487487, 10954862, 21570212]

# Plotting
plt.figure(figsize=(10, 6))
plt.plot(sizes, mm_quick_sort_times, label='MMQuickSort', marker='o')

# Logarithmic scale for better visualization
plt.xscale('log')
plt.yscale('log')
plt.xlabel('Input Size (log scale)')
plt.ylabel('Average Runtime (ns, log scale)')
plt.title('Sorting Algorithm Performance Comparison')
plt.legend()
plt.grid(True)
plt.show()

