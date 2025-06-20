# ScrollHelper

A tiny utility for Android to prevent parent views from intercepting touch events.  
Helps fix common nested scrolling conflicts between `RecyclerView`, `ScrollView`, `HorizontalScrollView`, and other scrollable views.

No Gradle dependency needed — just copy-paste one Kotlin or Java file into your project.

---

## Features

- Simple API to fix scroll gesture conflicts.
- Works with any `View`, including nested scrollable views.
- No XML changes required.
- Lightweight, no dependencies.

---

## Usage

### Kotlin

```kotlin
import com.yourpackage.scrollhelper.dontGiveScroll

binding.recyclerView.dontGiveScroll(true)
binding.horizontalScrollView.dontGiveScroll(true)
```

### Java

```java
import com.yourpackage.scrollhelper.ScrollHelper;

ScrollHelper.dontGiveScroll(binding.recyclerView, true);
ScrollHelper.dontGiveScroll(binding.horizontalScrollView, true);
```

---

## Installation

Just copy one of the following files into your project:

**For Kotlin:**

- **File:** `ScrollHelper.kt`  
- **Location:** `com/yourpackage/scrollhelper/ScrollHelper.kt`

**For Java:**

- **File:** `ScrollHelper.java`  
- **Location:** `com/yourpackage/scrollhelper/ScrollHelper.java`

---

## API

**Kotlin Extension Function**

```kotlin
fun View.dontGiveScroll(enable: Boolean)
```

**Java Static Method**

```java
ScrollHelper.dontGiveScroll(@NonNull View view, boolean enable)
```
