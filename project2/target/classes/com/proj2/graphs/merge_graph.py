import matplotlib.pyplot as plt

# Data
sizes = [1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576]
merge_sort_times = [96237, 215425, 1618950, 1185950, 2193037, 2820412, 5839600, 16093375, 22649287, 48696912, 101690600]

# Plotting
plt.figure(figsize=(10, 6))
plt.plot(sizes, merge_sort_times, label='MergeSort', marker='o')


# Logarithmic scale for better visualization
plt.xscale('log')
plt.yscale('log')
plt.xlabel('Input Size (log scale)')
plt.ylabel('Average Runtime (ns, log scale)')
plt.title('Sorting Algorithm Performance Comparison')
plt.legend()
plt.grid(True)
plt.show()

