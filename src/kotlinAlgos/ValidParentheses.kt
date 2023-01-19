package kotlinAlgos

import java.util.*

fun main() {
    println("is Valid Parentheses: ${isValid("{}")}")
}

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    s.forEach { value ->
        when (value) {
            '(' -> stack.push(')')
            '{' -> stack.push('}')
            '[' -> stack.push(']')
            else -> if (stack.isEmpty() || stack.pop() != value) {
                return false
            }
        }
    }
    return stack.isEmpty()
}