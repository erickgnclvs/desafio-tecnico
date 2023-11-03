/*
 * XML Type:  getTiposDeDocumentoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeDocumentoResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getTiposDeDocumentoResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetTiposDeDocumentoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeDocumentoResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeDocumentoResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPOSDEDOCUMENTO$0 = 
        new javax.xml.namespace.QName("", "tiposDeDocumento");
    
    
    /**
     * Gets array of all "tiposDeDocumento" elements
     */
    public br.jus.tjsc.www.selo.TipoDocumento[] getTiposDeDocumentoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIPOSDEDOCUMENTO$0, targetList);
            br.jus.tjsc.www.selo.TipoDocumento[] result = new br.jus.tjsc.www.selo.TipoDocumento[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tiposDeDocumento" element
     */
    public br.jus.tjsc.www.selo.TipoDocumento getTiposDeDocumentoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoDocumento target = null;
            target = (br.jus.tjsc.www.selo.TipoDocumento)get_store().find_element_user(TIPOSDEDOCUMENTO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tiposDeDocumento" element
     */
    public int sizeOfTiposDeDocumentoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOSDEDOCUMENTO$0);
        }
    }
    
    /**
     * Sets array of all "tiposDeDocumento" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTiposDeDocumentoArray(br.jus.tjsc.www.selo.TipoDocumento[] tiposDeDocumentoArray)
    {
        check_orphaned();
        arraySetterHelper(tiposDeDocumentoArray, TIPOSDEDOCUMENTO$0);
    }
    
    /**
     * Sets ith "tiposDeDocumento" element
     */
    public void setTiposDeDocumentoArray(int i, br.jus.tjsc.www.selo.TipoDocumento tiposDeDocumento)
    {
        generatedSetterHelperImpl(tiposDeDocumento, TIPOSDEDOCUMENTO$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tiposDeDocumento" element
     */
    public br.jus.tjsc.www.selo.TipoDocumento insertNewTiposDeDocumento(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoDocumento target = null;
            target = (br.jus.tjsc.www.selo.TipoDocumento)get_store().insert_element_user(TIPOSDEDOCUMENTO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tiposDeDocumento" element
     */
    public br.jus.tjsc.www.selo.TipoDocumento addNewTiposDeDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.TipoDocumento target = null;
            target = (br.jus.tjsc.www.selo.TipoDocumento)get_store().add_element_user(TIPOSDEDOCUMENTO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tiposDeDocumento" element
     */
    public void removeTiposDeDocumento(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOSDEDOCUMENTO$0, i);
        }
    }
}
