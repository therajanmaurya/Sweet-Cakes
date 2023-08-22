package practice

import java.util.Stack

fun main() {
    println("${validParentheses("()[]{}")}")
}

fun validParentheses(s: String): Boolean {
    val stack = Stack<Char>()
    s.toCharArray().forEach {
        when (it) {
            '(' -> stack.push(')')
            '{' -> stack.push('}')
            '[' -> stack.push(']')
            else -> if (stack.isEmpty() || stack.pop() != it) {
                return false
            }
        }
    }
    return stack.isEmpty()
}