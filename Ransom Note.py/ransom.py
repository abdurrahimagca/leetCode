def canConstruct(ransomNote: str, magazine: str) -> bool:    
    for i in range(len(ransomNote)):
        #checks how many letter in second text if it is not enough returns false and quit
        if(ransomNote.count(ransomNote[i]) > magazine.count(ransomNote[i])):
            return False
    return True

def main():
    first = input("first: ")
    second = input("second: ")
    if(canConstruct(first,second)):
        print("true")
    else:
        print("false")


if __name__ == "__main__":
    main()



