import matplotlib.pyplot as plt

# Data
sizes = [1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576]
quick_sort_times = [86149, 20249, 57437, 353549, 24425, 104350, 375599, 604099, 1685587, 2921575, 3054000]

# Plotting
plt.figure(figsize=(10, 6))
plt.plot(sizes, quick_sort_times, label='QuickSort', marker='o')

# Logarithmic scale for better visualization
plt.xscale('log')
plt.yscale('log')
plt.xlabel('Input Size (log scale)')
plt.ylabel('Average Runtime (ns, log scale)')
plt.title('Sorting Algorithm Performance Comparison')
plt.legend()
plt.grid(True)
plt.show()

