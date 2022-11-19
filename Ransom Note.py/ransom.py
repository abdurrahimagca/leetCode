def canConstruct(ransomNote: str, magazine: str) -> bool:
    d={}
    len_d = 0
        
    for i in ransomNote:
            if i in d:
                d[i] += 1
            else:
                d[i] = 1
                len_d += 1
        
    for i in magazine:
            if i in d:
                d[i] -= 1
                if d[i] == 0:
                    len_d -= 1
                    if len_d == 0:
                        return True
        
    return False

def main():
    first = input("first: ")
    second = input("second: ")
    if(canConstruct(first,second)):
        print("true")
    else:
        print("false")


if __name__ == "__main__":
    main()



