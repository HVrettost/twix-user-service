package twix.user.mapper;

public interface DtoMapper<T, S> {

    T toDto(S s);
}
