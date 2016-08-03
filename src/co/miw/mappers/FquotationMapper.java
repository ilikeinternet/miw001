/**
 * Because using MyBatis3+ and Spring, choose the Injecting Mapper method to replace traditional DAO method.
 */
package co.miw.mappers;

import co.miw.models.Fquotation;

/**
 * @author JTLi
 * Refer to the following mapping relationships between program and DB transaction(SQL):
 * insert - Create; select/query - Retrieve; update - Update; delete - Delete;
 */
public interface FquotationMapper {
 //Insert a quotation information.
   void insertFquotation(Fquotation fquotation) throws Exception;
}
