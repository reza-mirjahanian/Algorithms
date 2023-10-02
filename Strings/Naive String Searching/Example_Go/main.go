package main

import "fmt"

func naiveSearch(text, pattern string) {

	n := len(text)
	m := len(pattern)

	for i := 0; i <= n-m; i++ {
		match := true

		for j := 0; j < m; j++ {
			if text[i+j] != pattern[j] {
				match = false
				break
			}
		}

		if match {
			fmt.Printf("Pattern found at index %d\n", i)
		}
	}
}

func main() {
	text := "AABAACAADAABAABA"
	pattern := "AABA"

	naiveSearch(text, pattern)
}
