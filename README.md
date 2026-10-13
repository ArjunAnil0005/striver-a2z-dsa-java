# 🚀 striver-a2z-dsa-java

> Striver's A2Z DSA Sheet solved in **Java**, with a GitHub repo for visible proof of work, LeetCode for practice and contests, and a small revision notebook for retention. Built to prepare for **product-based company interviews**.

![Language](https://img.shields.io/badge/language-Java%2017-orange)
![Progress](https://img.shields.io/badge/progress-0%2F455-blue)
![License](https://img.shields.io/badge/license-MIT-green)

---

## 📌 Table of Contents

1. [Why this repo](#-why-this-repo)
2. [The four-tool system](#-the-four-tool-system)
3. [Repository structure](#-repository-structure)
4. [A2Z topic tracker](#-a2z-topic-tracker)
5. [Target companies](#-target-companies)
6. [Roadmap](#-roadmap)
7. [Solution template](#-solution-template)
8. [Revision notebook format](#-revision-notebook-format)
9. [Daily workflow](#-daily-workflow)
10. [Beyond DSA](#-beyond-dsa)
11. [How to use this repo](#-how-to-use-this-repo)

---

## 🎯 Why this repo

Grinding problems alone is not enough. Product companies look for:

- **Problem-solving ability**: can you reason from brute force to optimal?
- **Clean code**: readable, well-named, edge cases handled
- **Communication**: can you explain trade-offs and complexity?
- **Consistency**: evidence of sustained effort over months

This repo covers all four.

---

## 🧰 The four-tool system

Each tool has a different purpose. Do not use them interchangeably.

| Tool | Purpose | When to use |
|------|---------|-------------|
| **Striver A2Z Sheet** | Structured curriculum: *what* to learn, in order | Daily learning; follow the order |
| **GitHub (this repo)** | Public proof of work and a personal reference library | After solving each problem |
| **LeetCode** | Interview-style practice, contests, company tags | Weekly contests plus topic-wise reinforcement |
| **Revision notebook** | Retention: patterns, mistakes, key insights | 5 minutes after each problem; weekly review |

**Rule of thumb:** *Learn* from Striver → *Reinforce* on LeetCode → *Record* on GitHub → *Retain* in the notebook.

---

## 📁 Repository structure

```
striver-a2z-dsa-java/
├── README.md
├── 01-basics/
│   ├── maths/
│   ├── recursion/
│   ├── hashing/
│   └── patterns/
├── 02-sorting/
├── Arrays/
│   ├── Easy/
│   │   ├── README.md            # Striver A2Z indices for easy array problems
│   │   ├── SecondLargestNumber/
│   │   └── MoveZeroes/
│   ├── Medium/
│   │   ├── README.md            # Striver A2Z indices for medium array problems
│   │   └── TwoSum/
│   ├── CheckPrime/
│   ├── FibanocciSeries/
│   └── PalindromeNumber/
├── 04-binary-search/
├── 05-strings/
├── 06-linked-list/
├── 07-recursion-backtracking/
├── 08-bit-manipulation/
├── 09-stack-queue/
├── 10-sliding-window-two-pointers/
├── 11-heaps/
├── 12-greedy/
├── 13-binary-trees/
├── 14-binary-search-trees/
├── 15-graphs/
├── 16-dynamic-programming/
├── 17-tries/
├── 18-advanced/            # segment tree, DSU, etc.
├── revision-notes/
│   ├── patterns.md
│   ├── mistakes-log.md
│   └── cheatsheet.md
├── company-wise/
│   └── <company>.md
├── system-design/
├── low-level-design/
└── utils/
    └── TemplateSolution.java
```

**File naming convention:** `P0123_TwoSum.java` (problem number, then PascalCase name).

---

## 📊 A2Z topic tracker

Update this table as you progress.

| # | Topic | Total | Solved | Status |
|---|-------|:-----:|:------:|:------:|
| 1 | Learn the basics | 31 | 0 | ⬜ |
| 2 | Sorting | 7 | 0 | ⬜ |
| 3 | Arrays (Easy / Medium / Hard) | 40 | 0 | ⬜ |
| 4 | Binary Search | 32 | 0 | ⬜ |
| 5 | Strings (Basic / Medium) | 15 | 0 | ⬜ |
| 6 | Linked List | 31 | 0 | ⬜ |
| 7 | Recursion | 25 | 0 | ⬜ |
| 8 | Bit Manipulation | 18 | 0 | ⬜ |
| 9 | Stack and Queues | 25 | 0 | ⬜ |
| 10 | Sliding Window and Two Pointers | 12 | 0 | ⬜ |
| 11 | Heaps | 17 | 0 | ⬜ |
| 12 | Greedy | 16 | 0 | ⬜ |
| 13 | Binary Trees | 39 | 0 | ⬜ |
| 14 | Binary Search Trees | 16 | 0 | ⬜ |
| 15 | Graphs | 54 | 0 | ⬜ |
| 16 | Dynamic Programming | 56 | 0 | ⬜ |
| 17 | Tries | 7 | 0 | ⬜ |
| 18 | Strings (Advanced) | 9 | 0 | ⬜ |

> Counts are approximate; check the official sheet for the latest numbers.

Legend: ⬜ Not started · 🟨 In progress · ✅ Done

---

## 🏢 Target companies

Different companies weigh different skills. Use this to tune your preparation. The "typical focus" column is a general observation from public interview experiences and can change; always verify against recent candidate reports.

### Tier 1: Heavy DSA and problem solving

| Company | Typical focus |
|---------|---------------|
| **Atlassian** | DSA, practical coding, design, values round |
| **Stripe** | Practical coding, API and integration-style problems, debugging |
| **Databricks** | DSA (medium to hard), distributed systems fundamentals |
| **Snowflake** | DSA, databases and systems knowledge |
| **Confluent** | DSA, distributed systems, Kafka concepts |
| **Palantir** | DSA, decomposition and problem solving |
| **Coinbase** | DSA, practical coding, system design |
| **Figma** | DSA, product-minded engineering, system design |
| **Plaid** | DSA, practical problems, system design |
| **Brex** | DSA, system design, product sense |
| **CrowdStrike** | DSA, systems and security fundamentals |
| **Twilio** | DSA, API design, system design |
| **Elastic** | DSA, search and distributed systems concepts |
| **Okta** | DSA, security and identity fundamentals |
| **HubSpot** | DSA, practical coding, system design |
| **Postman** | DSA, API-centric and practical problems |

### Tier 2: India product companies (DSA plus machine coding and LLD)

| Company | Typical focus |
|---------|---------------|
| **Zoho** | Multi-round programming tests, logic and pattern problems, strong fundamentals; often includes problem-solving on paper and a machine-coding round |
| **Zerodha** | Strong fundamentals, practical programming, systems thinking |
| **Razorpay** | DSA, machine coding or LLD, system design |
| **Groww** | DSA, machine coding, system design |
| **CRED** | DSA, machine coding or LLD, system design |
| **Juspay** | Programming fundamentals, often functional-style problem solving, practical coding |
| **BrowserStack** | DSA, practical coding, debugging |
| **Nutanix** | DSA, OS and systems concepts, multithreading |
| **Chargebee** | DSA, practical coding, system design |
| **InfraCloud** | Cloud-native, Kubernetes and DevOps knowledge plus coding |
| **3M India** | Core CS fundamentals, coding, domain-specific questions |

### Tier 3: Remote-first and open-source oriented

| Company | Typical focus |
|---------|---------------|
| **GitLab** | Practical coding, Git and CI/CD knowledge, async communication, strong open-source signal |
| **Supabase** | Postgres, backend and open-source contribution signal, practical engineering |
| **Canonical** | Linux and systems knowledge, open-source work, written communication, multiple interview stages |
| **Doist** | Practical coding, remote-work culture and communication |
| **Camunda** | Java and backend engineering, workflow and BPMN concepts, practical coding |

### Per-company checklist

For each target company, create `company-wise/<company>.md` with:

- [ ] Interview process (rounds and duration)
- [ ] Tech stack and what the product does
- [ ] LeetCode company-tagged problems solved
- [ ] Past interview experiences (links)
- [ ] Core CS topics to revise (OS, DBMS, CN, etc.)
- [ ] Design topics (HLD / LLD) to prepare
- [ ] Behavioural and culture-fit stories prepared

---

## 🗓️ Roadmap

A 16-week plan assuming 2–3 hours per day. Adjust to your timeline.

| Weeks | Focus | Output |
|-------|-------|--------|
| 1–2 | Basics, sorting, hashing, recursion | Java collections fluency |
| 3–4 | Arrays and binary search | Core pattern recognition |
| 5 | Strings, linked lists | Pointer manipulation |
| 6 | Stack, queue, sliding window, two pointers | Monotonic stack, window patterns |
| 7 | Backtracking, bit manipulation | Recursion trees |
| 8 | Heaps, greedy | Priority queue mastery |
| 9–10 | Trees and BST | Traversals, LCA, serialization |
| 11–12 | Graphs | BFS/DFS, Dijkstra, topological sort, DSU |
| 13–15 | Dynamic programming | Memoization to tabulation to space optimization |
| 16 | Tries, advanced topics, mock interviews | Full revision |

**In parallel (from week 4):** one LeetCode contest per week, and 1 CS-fundamentals topic per week.

---

## 🧩 Solution template

Every solution file follows the same structure so it is easy to revise later.

```java
/**
 * Problem   : Two Sum
 * Platform  : LeetCode #1 | Striver A2Z: Arrays > Medium
 * Link      : https://leetcode.com/problems/two-sum/
 * Difficulty: Easy
 * Topics    : Array, Hash Map
 * Companies : Amazon, Atlassian, Stripe
 *
 * Approach 1 (Brute force): check every pair
 *   Time: O(n^2)  Space: O(1)
 *
 * Approach 2 (Optimal): single pass with HashMap of value -> index
 *   Time: O(n)    Space: O(n)
 *
 * Key insight : For each x, look up (target - x) among elements seen so far.
 * Edge cases  : duplicates, negative numbers, no valid pair.
 * Mistakes    : (note anything you got wrong on the first attempt)
 */
import java.util.*;

public class P0001_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.containsKey(need)) {
                return new int[]{seen.get(need), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        P0001_TwoSum sol = new P0001_TwoSum();
        System.out.println(Arrays.toString(sol.twoSum(new int[]{2, 7, 11, 15}, 9))); // [0, 1]
    }
}
```

### Java reminders

- Prefer `ArrayDeque` over `Stack` and `LinkedList` for stacks and queues.
- Use `long` where sums or products can overflow `int`.
- Use `Integer.compare(a, b)` instead of `a - b` in comparators.
- Use `StringBuilder` for string building in loops.
- Know `PriorityQueue`, `TreeMap`, `TreeSet`, `HashMap`, `HashSet`, and `Arrays` / `Collections` utilities by heart.

---

## 📓 Revision notebook format

Keep it small. If it grows too large, you will stop reading it.

**`revision-notes/patterns.md`**: one entry per pattern:

```
## Sliding Window (variable size)
- Trigger: "longest/shortest subarray/substring with condition"
- Template: expand right, shrink left while invalid
- Problems: LC 3, 76, 424, 1004
```

**`revision-notes/mistakes-log.md`**: one line per mistake:

```
| Date | Problem | Mistake | Lesson |
| 2025-01-10 | LC 33 | Off-by-one in BS bounds | Decide inclusive/exclusive first |
```

**Revision schedule (spaced repetition):**

| After | Action |
|-------|--------|
| 1 day | Re-read your notes |
| 3 days | Re-solve without looking |
| 7 days | Re-solve the hard ones |
| 30 days | Random revision set |

---

## ⏱️ Daily workflow

1. **Pick** the next problem from the Striver sheet (do not skip around).
2. **Think** for 20–30 minutes without hints. Write the brute force first.
3. **Learn** if stuck: watch the explanation, then close it and code on your own.
4. **Optimize** and state time and space complexity out loud.
5. **Commit** the solution to this repo using the template.
6. **Note** the pattern or mistake in the revision notebook (5 minutes).
7. **Mirror** a similar problem on LeetCode to confirm the pattern transferred.

**Commit message convention:**

```
feat(arrays): add Kadane's algorithm (LC 53)
fix(graphs): correct Dijkstra edge case for zero weights
docs(notes): update sliding window pattern
```

---

## 🧠 Beyond DSA

Product companies rarely stop at DSA. Add these as you progress.

| Area | What to cover |
|------|---------------|
| **Core CS** | OS (processes, threads, deadlocks, scheduling), DBMS (indexing, transactions, normalization), Computer Networks (TCP/IP, HTTP, DNS) |
| **Java** | Collections internals, concurrency (`ExecutorService`, locks, `ConcurrentHashMap`), JVM memory and GC, streams |
| **Low-level design** | SOLID, design patterns, parking lot, LRU cache, rate limiter, splitwise, elevator |
| **High-level design** | Load balancing, caching, sharding, replication, queues, CAP theorem, URL shortener, chat system |
| **SQL** | Joins, window functions, indexing, query optimization |
| **Behavioural** | STAR stories: conflict, failure, ownership, ambiguity, leadership |

---

## 🛠️ How to use this repo

```bash
# Clone
git clone https://github.com/<your-username>/striver-a2z-dsa-java.git
cd striver-a2z-dsa-java

# Array problems are grouped by difficulty under Arrays/Easy and Arrays/Medium.
# See each folder's README.md for its Striver A2Z index.
```

**Requirements:** JDK 17+ (any recent LTS works).

---

## 📈 Progress log

| Week | Problems solved | LeetCode contests | Notes |
|------|:---------------:|:-----------------:|-------|
| 1 | 0 | 0 | |

---

## 🤝 Contributing

This is a personal learning repo, but suggestions and alternative approaches are welcome via issues or pull requests.

## 📄 License

MIT. Use it, fork it, learn from it.

---

⭐ If this helps your preparation, consider starring the repo.