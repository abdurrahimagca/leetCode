def canConstruct(ransomNote: str, magazine: str) -> bool:
    checker = True
    for i in range(len(ransomNote)):
        if(ransomNote.count(ransomNote[i]) > magazine.count(ransomNote[i])):
            checker = False
            return checker
    return checker

def main():
    first = input("first: ")
    second = input("second: ")
    if(canConstruct(first,second)):
        print("true")
    else:
        print("false")


if __name__ == "__main__":
    main()



