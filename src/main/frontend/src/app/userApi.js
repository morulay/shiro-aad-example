import useSwr from "swr";

export default function useCurrentUserInfo() {
  return useSwr("/api/users/current");
}
