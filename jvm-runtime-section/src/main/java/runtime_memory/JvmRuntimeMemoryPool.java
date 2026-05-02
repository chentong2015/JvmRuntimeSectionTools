package runtime_memory;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.util.List;

// TODO. JVM的三大组成部分
// 1. Class Loader Subsystem 类装载子系统
// 2. Runtime Data Area 运行时的数据区域(内存模型)
// 3. Execution Engine 字节码执行引擎: Jit即时编译器，GC垃圾回收器
public class JvmRuntimeMemoryPool {

    // 获取当前JVM内存池的数据
    // Metaspace, G1 Eden Space, G1 Survivor Space, G1 Old Gen
    public static void main(String[] args) {
        List<MemoryPoolMXBean> pools = ManagementFactory.getMemoryPoolMXBeans();
        for (MemoryPoolMXBean pool : pools) {
            System.out.println(pool.getName());
            System.out.println(pool.getType()); // Heap or Non-heap
            System.out.println(pool.getUsage());
            System.out.println(pool.getCollectionUsage());
            System.out.println(pool.getPeakUsage());
            System.out.println("------------------------------------");
        }
    }
}
