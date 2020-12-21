package twix.user.mapper;

public interface EntityMapper<T, S> {

    T toEntity(S s);
}
